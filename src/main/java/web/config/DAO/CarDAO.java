package web.config.DAO;

import org.springframework.stereotype.Component;
import web.config.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {

    private List<Car> carsList;
     {
         carsList = new ArrayList<>();
         carsList.add(new Car("model_1", "color_1", 1111));
         carsList.add(new Car("model_2", "color_2", 2222));
         carsList.add(new Car("model_3", "color_3", 3333));
         carsList.add(new Car("model_4", "color_4", 4444));
         carsList.add(new Car("model_5", "color_5", 5555));
    }

    public List<Car> getList(int count) {
         if(count < carsList.size()) {
             return carsList.subList(0, count);
         } else {
             return carsList;
         }
    }
}
