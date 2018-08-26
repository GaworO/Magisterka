$(function() {
    $("#check").click( function()
        {
            alert('button clicked');
        }
    );
});
$(function() {
    $("#check").click(function () {
        console.log('I am here');
        let req = require("request");

        const uri = 'https://ussouthcentral.services.azureml.net/workspaces/a6971f6fdc3e4a5cad2a84c4459f5a1e/services/5f7f26de80024d6fa13d5191a07a7fe6/execute?api-version=2.0&amp;format=swagger';
        const apiKey = '4ytJZPtM5wbH/iwTnr0eKP+w2BePM6gQRn9O3j/WG6PfJhwRY16Xk1hqDwCwKDTducmednoXoycOZm48egZnCA==';

        let data = {
            "Inputs": {
                "input1":
                    [
                        {
                            'column1': "value1",
                            'column2': "value2",
                            'column3': "value3"
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
                "Authorization": "Bearer " + apiKey,
            },
            body: JSON.stringify(data)
        }

    req(options, (err, res, body) => {

        if(
    !err &amp;&amp;  res.statusCode == 200
)
    {
        console.log(body);
    }
else
    {
        console.log("The request failed with status code: " + res.statusCode);
    }
})

    });
});
