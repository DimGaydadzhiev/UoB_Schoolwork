package Lab6AB;

class Box {

    private int length, width, height;
    private int volume;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = length * width * height;
    }

    public Box(int length, int width) {

    }

    
    /** 
     * @return int
     */
    public int getLength() {
        return this.length;
    }

    
    /** 
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }

    
    /** 
     * @return int
     */
    public int getWidth() {
        return this.width;
    }

    
    /** 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    
    /** 
     * @return int
     */
    public int getHeight() {
        return this.height;
    }

    
    /** 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    
    /** 
     * @return int
     */
    public int getVolume() {
        return volume;
    }

}
