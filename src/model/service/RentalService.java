package model.service;

public class RentalService {
    
    public Double pricePerHour;
    public Double pricePerDay;
    
    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }
    
    public void processInvoice(CarRental carRental){
        
    }
    
}
