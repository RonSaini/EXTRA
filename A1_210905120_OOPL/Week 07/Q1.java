import com.course.structure.Building;
import com.course.structure.House;
import com.course.structure.School;

class Q1{
	public static void main(String[] args){
		Building building = new Building();
		House house = new House();
        School school = new School();
        school.setFootage(100);
        System.out.println(school.getFootage());
	}
}
