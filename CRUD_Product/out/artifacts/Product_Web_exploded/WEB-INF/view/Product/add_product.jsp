<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <title>Add Product</title>
</head>
<body>

<h2>Add Product</h2>

<form method="post" action="/product/save">


    <div>
        <label>Product Name</label><br>
        <input type="text" name="name" required>
    </div>


    <div>
        <label>Product Code</label><br>
        <input type="text" name="code" required>
    </div>

    <div>
        <label>Description</label><br>
        <textarea name="description" rows="3" required></textarea>
    </div>


    <div>
        <label>Price</label><br>
        <input type="number" name="price" step="0.01" required>
    </div>


    <div>
        <label>Quantity</label><br>
        <input type="number" name="quantity" required>
    </div>


    <div>
        <label>Status</label><br>
        <select name="status" required>
            <option value="">-- Select Status --</option>
            <option value="ACTIVE">Active</option>
            <option value="INACTIVE">Inactive</option>
        </select>
    </div>


    <div>
        <label>Category</label><br>
        <select name="category.categorId" required>
            <option value="1">Electronics</option>
            <option value="2">Clothing</option>
            <option value="3">Books</option>
        </select>
    </div>


    <div>
        <label>Brand</label><br>
        <select name="brandId" required>
            <option value="101">Apple</option>
            <option value="102">Samsung</option>
            <option value="103">Sony</option>
        </select>
    </div>


    <div style="margin-top: 12px;">
        <button type="submit">Save Product</button>
    </div>

</form>


</body>
</html>
