package ba.unsa.etf.rpr.projekat;

import javafx.collections.ObservableList;

public interface VehiclesDAO {
    ObservableList<Owner> getOwners();

    ObservableList<Vehicle> getVehicles();

    ObservableList<Location> getLocations();

    ObservableList<Brand> getBrands();

    ObservableList<Part> getParts();

    ObservableList<Service> getServices();

    void addOwner(Owner owner);

    void changeOwner(Owner owner);

    void deleteOwner(Owner owner);

    void addVehicle(Vehicle vehicle);

    void changeVehicle(Vehicle vehicle);

    void deleteVehicle(Vehicle vehicle);

    void addPart(Part part);

    void changePart(Part part);

    void deletePart(Part part);

    void addService(Service service);

    void changeService(Service service);

    void deleteService(Service service);

    void close();
}
