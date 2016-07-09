/**
 * 
 */
package sj;

/**
 * @author JOSHI
 *
 */
public class Trainer {
int id;
String name;
String stream;
@Override
public String toString() {
	return "Trainer [id=" + id + ", name=" + name + ", stream=" + stream + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
}
