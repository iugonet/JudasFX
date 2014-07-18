package org.iugonet.www;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import lombok.Data;

import org.geotools.data.FileDataStore;
import org.geotools.data.FileDataStoreFinder;
import org.geotools.data.simple.SimpleFeatureCollection;
import org.geotools.data.simple.SimpleFeatureIterator;
import org.geotools.data.simple.SimpleFeatureSource;
import org.opengis.feature.simple.SimpleFeature;
import org.opengis.geometry.Geometry;
import org.opengis.geometry.primitive.Point;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.MultiPolygon;

@Data
abstract public class Mplot extends Aplot {

	Mplot(){
		
	}
	
	public void iterating() throws IOException{
        File file = new File("110m_cultural\\110m_admin_0_countries.shp");
        FileDataStore store = FileDataStoreFinder.getDataStore(file);
        SimpleFeatureSource featureSource = store.getFeatureSource();
        SimpleFeatureCollection c = featureSource.getFeatures();
        SimpleFeatureIterator featuresIterator = c.features();
        Coordinate[] coords;
        Geometry polygon;
        Point centroid;
        Bounds bounds;
        while (featuresIterator.hasNext()) {
            SimpleFeature o = featuresIterator.next();
            String name = (String) o.getAttribute("NAME");
            Object geometry = o.getDefaultGeometry();
        }
	}

	public void panning() {
		 map.setOnMousePressed(new EventHandler<MouseEvent>() {
			 public void handle(MouseEvent event) {
			 scene.setCursor(Cursor.MOVE);
			 dragBaseX = map.translateXProperty().get();
			 dragBaseY = map.translateYProperty().get();
			 dragBase2X = event.getSceneX();
			 dragBase2Y = event.getSceneY();
			 }
			 });
			 map.setOnMouseDragged(new EventHandler<MouseEvent>() {
			 public void handle(MouseEvent event) {
			 map.setTranslateX(dragBaseX + (event.getSceneX()-dragBase2X));
			 map.setTranslateY(dragBaseY + (event.getSceneY()-dragBase2Y));
			 }
			 });
			 map.setOnMouseReleased(new EventHandler<MouseEvent>() {
			 public void handle(MouseEvent event) {
			 scene.setCursor(Cursor.DEFAULT);
			 }
			 });
	}

	public void polygons() {
		 if (geometry instanceof MultiPolygon) {
			 MultiPolygon multiPolygon = (MultiPolygon) geometry;
			  
			 centroid = multiPolygon.getCentroid();
			 final Text text = new Text(name);
			 bounds = text.getBoundsInLocal();
			 text.getTransforms().add(new Translate(centroid.getX(), centroid.getY()));
			 text.getTransforms().add(new Scale(0.1,-0.1));
			 text.getTransforms().add(new Translate(-bounds.getWidth()/2., bounds.getHeight()/2.));
			 texts.getChildren().add(text);
			 for (int geometryI=0;geometryI<multiPolygon.getNumGeometries();geometryI++) {
			 polygon = multiPolygon.getGeometryN(geometryI);
			 coords = polygon.getCoordinates();
			 Path path = new Path();
			 path.setStrokeWidth(0.05);
			 currentColor = (currentColor+1)%colors.length;
			 path.setFill(colors[currentColor]);
			 path.getElements().add(new MoveTo(coords[0].x, coords[0].y));
			 for (int i=1;i<coords.length;i++) {
			 path.getElements().add(new LineTo(coords[i].x, coords[i].y));
			 }
			 path.getElements().add(new LineTo(coords[0].x, coords[0].y));
			 map1.getChildren().add(path);
			 }
		}
	}
	
	public void zoom() {
		 private void zoom(double d) {
			 map.scaleXProperty().set(map.scaleXProperty().get() * d);
			 map.scaleYProperty().set(map.scaleYProperty().get() * d);
			 }
			  
			 // ...
			  
			 VBox vbox = new VBox();
			 final Button plus = new Button("+");
			 plus.setOnAction(new EventHandler<ActionEvent>() {
			 public void handle(ActionEvent event) {
			 zoom(1.4);
			 }
			 });
			 vbox.getChildren().add(plus);
			 final Button minus = new Button("-");
			 minus.setOnAction(new EventHandler<ActionEvent>() {
			 public void handle(ActionEvent event) {
			 zoom(1./1.4);
			 }
			 });
			 vbox.getChildren().add(minus);
			 root.getChildren().add(vbox);
	}
}
