<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Invoice</title>
<style>
    body { font-family: Arial, sans-serif; background: #f2f2f2; padding: 20px; }
    .invoice-box {
        width: 450px;
        margin: auto;
        background: #fff;
        border-radius: 10px;
        padding: 20px 25px;
        box-shadow: 0 6px 15px rgba(0,0,0,0.15);
    }
    h2 {
        text-align: center;
        margin-bottom: 15px;
        color: #333;
    }
    .row { display: flex; justify-content: space-between; margin: 6px 0; font-size: 14px; }
    .row strong { color: #111; }
    .divider {
        border-top: 1px solid #ccc;
        margin: 12px 0;
    }
    .total { font-size: 15px; font-weight: bold; }
    .print-btn {
        width: 100%;
        background: #007bff;
        color: white;
        padding: 8px;
        font-size: 15px;
        border: none;
        border-radius: 6px;
        cursor: pointer;
        margin-top: 15px;
    }
    .print-btn:hover { background: #005ecb; }
</style>
</head>
<body>

<div class="invoice-box">
    <h2>Invoice</h2>

    <div class="row"><strong>Invoice No:</strong><span>INV-0019</span></div>
    <div class="row"><strong>Date:</strong><span>05 Dec 2025</span></div>

    <div class="divider"></div>

    <div class="row"><strong>Customer:</strong><span>Yogesh Kumar Behera</span></div>
    <div class="row"><strong>Mobile:</strong><span>99999 99999</span></div>

    <div class="divider"></div>

    <div class="row"><strong>Item:</strong><span>Wireless Earbuds</span></div>
    <div class="row"><strong>Qty:</strong><span>1</span></div>
    <div class="row"><strong>Price:</strong><span>₹ 2,499.00</span></div>
    <div class="row"><strong>Discount:</strong><span>₹ 300.00</span></div>
    <div class="row"><strong>Tax:</strong><span>₹ 150.00</span></div>

    <div class="divider"></div>

    <div class="row total"><strong>Grand Total</strong><span>₹ 2,349.00</span></div>

    <button class="print-btn" onclick="window.print()">Download / Print</button>
</div>

</body>
</html>
