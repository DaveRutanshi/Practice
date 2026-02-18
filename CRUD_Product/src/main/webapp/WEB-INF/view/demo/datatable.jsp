<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Data Table</title>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://cdn.datatables.net/2.3.6/js/dataTables.js"></script>

    <link rel="stylesheet" href="https://cdn.datatables.net/2.3.6/css/dataTables.dataTables.css" />

</head>
<body>
<table id="myTable">
    <thead>
    <tr>
        <th>Sr.No.</th>
        <th>Id</th>
        <th>Name</th>
        <th>Code</th>
        <th>Description</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Status</th>
        <th>CreatedAt</th>
        <th>UpdatedAt</th>
        <th>IsDeleted</th>
        <th>Category Id</th>
        <th>Brand Id</th>
    </tr>
    </thead>
</table>
<script>
    $(document).ready(function () {
        $('#myTable').DataTable({
            ajax: {
                url: 'http://localhost:8080/api/product',
                type:'POST'
            },
            columns: [
                { data: 'id'  },            //0
                { data: 'id'  },            //1
                { data: 'name'  },          //2
                { data: 'code'  },          //3
                { data: 'description'  },   //4
                { data: 'price'  },         //5
                { data: 'quantity'  },      //6
                { data: 'status'  },        //7
                { data: 'createdAt'  },     //8
                { data: 'updatedAt'  },     //9
                { data: 'deleted'  },       //10
                { data: 'category'  },      //11
                { data: 'brandId'  }        //12
            ],
            columnDefs: [
                {
                    targets: 0,
                    orderable: !1,
                    render: function (a, e, t, n) {
                        return n.row + n.settings._iDisplayStart + 1;
                    }
                },
                {
                    targets: 0,
                    orderable: !1,
                    render: function (a, e, t, n) {
                        return n.row + n.settings._iDisplayStart + 1;
                    }
                },
                {
                    targets: 11,
                    orderable: !1,
                    className: "text-center",
                    width : "200px !important",
                    render: function (a, e, t, n) {
                        return t.category ? t.category : "-";
                    }
                }
            ]
        });
    });</script>
</body>
</html>