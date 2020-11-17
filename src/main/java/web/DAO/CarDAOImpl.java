package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {

    private List<Car> carsList;
     {
         carsList = new ArrayList<>();
         carsList.add(new Car("Model 1", "Color 1", 1111));
         carsList.add(new Car("Model 2", "Color 2", 2222));
         carsList.add(new Car("Model 3", "Color 3", 3333));
         carsList.add(new Car("Model 4", "Color 4", 4444));
         carsList.add(new Car("Model 5", "Color 5", 5555));
    }

    public List<Car> getList(int count) {
         if(count < carsList.size()) {
             return carsList.subList(0, count);
         } else {
             return carsList;
         }
    }
}
