let req = require("request");

const uri = "<4ytJZPtM5wbH/iwTnr0eKP+w2BePM6gQRn9O3j/WG6PfJhwRY16Xk1hqDwCwKDTducmednoXoycOZm48egZnCA==>";
const apiKey = "<4ytJZPtM5wbH/iwTnr0eKP+w2BePM6gQRn9O3j/WG6PfJhwRY16Xk1hqDwCwKDTducmednoXoycOZm48egZnCA==>";

let data = {
    "Inputs": {
        "input1":
            [
                {
                    "ColumnNames": ["mean", "categ_0", "categ_1", "categ_2", "categ_3", "categ_4", "cluster"],
                    "Values": [ [ "0", "0", "0", "0", "0", "0", "0" ], [ "0", "0", "0", "0", "0", "0", "0" ],]
                }
            ],
    },
    "GlobalParameters": {}
}

const options = {
    uri: uri,
    method: "POST",
    headers: {
        "Content-Type": "application/json",
        "Authorization": "Bearer " + 4ytJZPtM5wbH/iwTnr0eKP+w2BePM6gQRn9O3j/WG6PfJhwRY16Xk1hqDwCwKDTducmednoXoycOZm48egZnCA==,
    },
    body: JSON.stringify(data)
}

req(options, (err, res, body) => {
    if (!err && res.statusCode == 200) {
    console.log(body);
} else {
    console.log("The request failed with status code: " + res.statusCode);
}
});