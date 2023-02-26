class Circle extends Shape {
    @Override
    public Colors render() {
        System.out.print("Circle.");
        return Colors.RED;
    }
}