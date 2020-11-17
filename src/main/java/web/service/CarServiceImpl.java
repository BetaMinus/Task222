package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.CarDAO;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getList(int count) {
        return carDAO.getList(count);
    }
}
