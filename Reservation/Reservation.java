package Reservation;
public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    public Reservation(int count, int capacity, boolean open) {
      if (count < 1 || count > 8) {
        System.out.println("Invalid reservation!");
      }
      guestCount = count;
          restaurantCapacity = capacity;
          isRestaurantOpen = open;
    }  
    
    public void confirmReservation() {
      if (restaurantCapacity >= guestCount && isRestaurantOpen) {
        System.out.println("Reservation confirmed");
        isConfirmed = true;
      } else {
        System.out.println("Reservation denied");
              isConfirmed = false;
      }
    }
    
    public void informUser() {
      if (!isConfirmed) {
        System.out.println("Unable to confirm reservation, please contact restaurant.");
      } else {
        System.out.println("Please enjoy your meal!");
      }
    }
    
    public static void main(String[] args) {
      // Create instances here
      Reservation Jacob = new Reservation (2, 100, true);
      Jacob.confirmReservation();
      Jacob.informUser();  
  
      Reservation birthdayParty = new Reservation (8, 100, true);
      birthdayParty.confirmReservation();
      birthdayParty.informUser();
  
      Reservation partyOfZero = new Reservation (0, 100, true);
      partyOfZero.confirmReservation();
      partyOfZero.informUser();
  
      Reservation noCapacity = new Reservation (4, 3, true);
      noCapacity.confirmReservation();
      noCapacity.informUser();
  
      Reservation notOpen = new Reservation (4, 100, false);
      notOpen.confirmReservation();
      notOpen.informUser();
  
    }
  }