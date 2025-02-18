 class Rectangle {
    public double length;
    public double width;

    public void Area() {
        double area = this.length * this.width;
        System.out.println("Area of rectangle is : " + area);
    }

    public void Perimeter() {
        double perimeter = 2 * (this.length + this.width);
        System.out.println("Perimeter of rectangle is : " + perimeter);
    }
}



