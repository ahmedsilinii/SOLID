package com.directi.training.srp.exercice_refactored;

public class CarManager
{
    private CarRepository _carRepository;
    private CarFormatter _carFormatter;
    private CarComparator _carComparator;

    public CarManager(CarRepository carRepository, CarFormatter carFormatter, CarComparator carComparator)
    {
        _carRepository = carRepository  ;
        _carFormatter = carFormatter;
        _carComparator = carComparator;
    }

    public Car getCarById(final String carId)
    {
        return _carRepository.getFromDb(carId);
    }

    public String getCarsNames()
    {
        return _carFormatter.getCarsNames(_carRepository.getAllCars());
    }

    public Car getBestCar()
    {
        return _carComparator.getBestCar(_carRepository.getAllCars());
    }
}