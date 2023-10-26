function matchPassword()
{
    if(document.getElementById('rpassword').value!=document.getElementById('password').value)
    {
	  alert("Confirm password does not match with password")
	  return false;
    }
    return true;
}

function applyJob() {
  const button = document.getElementById(".applyButton");

  if (button.textContent === "Apply") {
    // Perform the necessary actions (e.g., send an HTTP request to apply for the job)

    // Update the button text to "Applied"
    button.textContent = "Applied";

    // Disable the button to prevent further clicks
    button.style.pointerEvents = "none"; // This disables the click event
    button.style.color = "gray"; // You can change the color to indicate it's disabled
	button.disabled=true;
	
    // You can also display an alert to indicate successful application
    alert("You have successfully applied for this job!");
  }
  
}
