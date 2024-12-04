
package Building;

class building {
private    int floor;
private    int room;
    building()
    {
        this(2,4);
    }
    building(int floor,int room)
    {
        this.floor=floor;
        this.room=room;
    }
    void display()
    {
        System.out.println("Building with floor"+floor+" "+"floor with room:"+room);
    }
    	public static void main(String[] args) {
		building ob=new building();
		building ob1=new building(3,12);
		ob.display();
		ob1.display();	
	}
}