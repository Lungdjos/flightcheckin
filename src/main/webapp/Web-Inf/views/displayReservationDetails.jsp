<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" charset="UTF-8">
    <title>Display Reservation Details</title>
    <!-- css link bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <!-- javascript link -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body class="m-5">
    <h1 class="my-4">Complete Reservation</h1>

    <h2 class="my-4">Flight Details</h2>
    <p><label>No.:</label>    ${reservation.flight.flightNumber}</p>
    <p><label>Operating Airline:</label>    ${reservation.flight.operatingAirlines}</p>
    <p><label>Departure City:</label>        ${reservation.flight.departureCity}</p>
    <p><label>Destination City:</label>          ${reservation.flight.arrivalCity}</p>
    <p><label>Departure Date:</label>    ${reservation.flight.dateOfDeparture}</p>
    <p><label>Estimated Departure Time:</label>    ${reservation.flight.estimatedDepartureTime}</p>
    <hr>

    <h2 class="my-4">Passenger Details:</h2>
    <p><label>First Name:</label>    ${reservation.passenger.firstName}</p>
    <p><label>Middle Name:</label>    ${reservation.passenger.middleName}</p>
    <p><label>Last Name:</label>        ${reservation.passenger.lastName}</p>
    <p><label>Email:</label>          ${reservation.passenger.email}</p>
    <p><label>Phone No.:</label>    ${reservation.passenger.phone}</p>
    <hr>

    <form action="completeCheckIn" method="post">
        <div class="form-group mb-3">
          <label for="from">No. of Bags:</label>
          <input type="text" name="numberOfBags" value="" class="form-control" id="" placeholder="Enter Number of Bags" required>
        </div>
        <div class="form-group mb-3">
          <input type="hidden" name="reservationId" value="${reservation.id}" class="form-control" id="" placeholder="Reservation Id" required>
        </div>
        <hr>

        <button type="submit" value="confirm" class="btn btn-primary">Check In</button>
      </form>
</body>
</html>