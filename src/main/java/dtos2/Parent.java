package dtos2;

import generator.Description;

import java.util.List;

@Description(description = "A description to a class")
public class Parent {
    @Description(description = "Id")
    public String id;
    @Description(description = "Number of children")
    public int quantity;
    @Description(description = "List of children, each child has extra information")
    public List<Child> children;
}
