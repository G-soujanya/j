public class Point implements Comparable<Point>{
    int x;
    int y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public String toString()
    {
        return "x"+x+"y"+y;
    }
    public int compareTo(Point p)
    {
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else {
            if(this.y<p.y)
                return -1;
            else if(this.y>p.y)
                return 1;
            else
                return 0;
        }
    }

}
