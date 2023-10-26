let showDropdown = false;

function toggleDropdown() {
  const dropdown = document.getElementById("dropdownMenu");
  showDropdown = !showDropdown;
  dropdown.style.display = showDropdown ? "block" : "none";
}

function handleOptionClick(option) {
  const selectedOption = document.getElementById("selectedOption");
  selectedOption.innerHTML = `You selected: ${option}`;
  toggleDropdown();
}
