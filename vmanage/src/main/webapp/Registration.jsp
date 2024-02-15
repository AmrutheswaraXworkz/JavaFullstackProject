<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head >
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Vendor Management</title>
<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        
      
      </ul>
     
    </div>
  </div>
</nav>
<style>
  /* Reset default browser styles */
  * {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
  }

  /* Style the form container */
  .form-container {
    display: flex;
    justify-content: space-between;
  }

  /* Style the form sections */
  .form-section {
    flex: 1;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 8px;
    background-color: #f9f9f9;
    margin-right: 10px; /* Add some space between sections */
  }

  /* Style form inputs and labels */
  .form-section input[type="text"],
  .form-section input[type="number"],
  .form-section input[type="email"],
   .form-section input[type="date"],
  .form-section select {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
  }

  /* Style the select dropdown arrow */
  .form-section select {
    appearance: none;
    -webkit-appearance: none;
    -moz-appearance: none;
    background-image: url('data:image/svg+xml;utf8,<svg fill="currentColor" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20"><path d="M10 12l-7-7 1.5-1.5L10 9l5.5-5.5L18 5z"/></svg>');
    background-repeat: no-repeat;
    background-position-x: calc(100% - 10px);
    background-position-y: center;
  }

  /* Style the submit button */
  .form-section input[type="submit"] {
    width: 100%;
    padding: 10px;
    border: none;
    border-radius: 4px;
    background-color: #007bff;
    color: #fff;
    cursor: pointer;
  }

  /* Style the placeholder text */
  .form-section input[type="text"]::placeholder,
  .form-section input[type="number"]::placeholder,
  .form-section input[type="email"]::placeholder,
  .form-section input[type="date"]::placeholder  {
    color: #aaa;
  }

  /* Style the form labels */
  .form-section label {
    margin-bottom: 5px;
    display: block;
  }

  /* Style the form on small screens */
  @media (max-width: 768px) {
    .form-container {
      flex-direction: column;
    }
    .form-section {
      margin-right: 0;
      margin-bottom: 10px; /* Add some space between sections */
    }
  }
</style>

</head>
<body>

<div class="form-container">
  <div class="form-section">
    <form action="vendor" method="post">
      <label for="name">Name</label>
      <input type="text" name="name" id="name" placeholder="Enter Your Name"/>
      <label for="location">Location</label>
      <input type="text" name="location" id="location" placeholder="Enter Location"/>
      <label for="gstNumber">GST Number</label>
      <input type="text" name="gstNumber" id="gstNumber" placeholder="Enter GST Number"/>
      <label for="startDate">Start Date</label>
      <input type="date" name="startDate" id="startDate" placeholder="Enter Start Date"/>
      <label for="ownerName">Owner Name</label>
      <input type="text" name="ownerName" id="ownerName" placeholder="Enter Owner Name"/>
      <label for="serviceType">Service Type</label>
      <select class="form-select" aria-label="Default select example" name="serviceType">
        <option selected>Select</option>
        <option value="water">Water</option>
        <option value="grocerries">Grocerries</option>
        <option value="drinks">Soft Drinks</option>
        <option value="automobile">Automobile</option>
      </select>
      
      <label for="contactNo">Contact Number</label>
      <input type="number" name="contactNo" id="contactNo" placeholder="Enter Contact Number"/>
      <label for="alternativeNo">Alternative Number</label>
      <input type="number" name="alternativeNo" id="alternativeNo" placeholder="Enter Alternative Number"/>
      <label for="email">Email</label>
      <input type="email" name="email" id="email" placeholder="Enter Email"/>
      <label for="website">Website</label>
      <input type="text" name="website" id="website" placeholder="Enter Your website"/>
      <input type="submit" value="Submit">
    </form>
  </div>
</div>



</body>
</html>