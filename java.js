// Cart functionality
let cartItems = parseInt(localStorage.getItem('cartItems')) || 0;

// Function to update the cart count
function updateCart() {
    const cartText = document.querySelector('.nav-cart');
    cartText.innerHTML = `<i class="fa-solid fa-cart-shopping"></i> Cart (${cartItems})`;
}

// Function to add item to cart
function addToCart() {
    cartItems++;
    updateCart();
    localStorage.setItem('cartItems', cartItems);
    alert("Item added to cart!");
}

// Example: Adding event listeners to add items to the cart
const productLinks = document.querySelectorAll('.box-content a');
productLinks.forEach(link => {
    link.addEventListener('click', function(e) {
        e.preventDefault();
        addToCart();
    });
});

// Handle the search functionality (currently logs the query to console)
document.querySelector('.search-input').addEventListener('input', function() {
    const query = this.value.toLowerCase();
    console.log("Searching for: ", query);
    // For now, log the search query to the console (later you can integrate with a search API or filtering)
});

// Example: Back to top functionality
document.querySelector('.foot-panel1 a').addEventListener('click', function(e) {
    e.preventDefault();
    window.scrollTo({
        top: 0,
        behavior: 'smooth'
    });
});

// Optionally, handle dynamic Google Map Embedding (if API key is correct)
function loadGoogleMap() {
    const iframe = document.querySelectorAll('iframe');
    iframe.forEach(el => {
        const src = el.getAttribute('src');
        if (src.includes("YOUR_GOOGLE_API_KEY")) {
            console.error('You must replace "YOUR_GOOGLE_API_KEY" with your actual Google Maps API Key.');
        }
    });
}

// Run the map check
loadGoogleMap();

// Initial cart count update
updateCart();

// Handle form submissions
document.getElementById("contactForm").addEventListener("submit", function (event) {
    event.preventDefault();
    alert("Message sent successfully!");
});

document.getElementById("checkoutForm").addEventListener("submit", function (event) {
    event.preventDefault();
    alert("Proceeding to payment...");
});
