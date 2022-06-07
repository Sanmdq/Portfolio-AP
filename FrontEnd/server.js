const express = require('express');
const path = require('path');
const app = express();

const PORT = process.env.PORT || 8000;

app.use(express.static(__dirname + '/dist/portfolio-ap'));

app.get('/*', (req, res) => {
    res.sendFile(__dirname + '/dist/portfolio-ap/index.html');
});

app.listen(PORT, () => {
    console.log('Servidor iniciando en puerto '+ PORT);
});