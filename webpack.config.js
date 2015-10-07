'use strict';

module.exports = {
    devtool: 'eval',
    entry: [
        __dirname + '/src/main/resources/app/js/main.js'
    ],
    output: {
        path: __dirname + '/src/main/resources/webapp/js',
        filename: 'bundle.js',
    },
    module: {
        loaders: [
            {
                test: /\.js$/,
                loader: 'babel-loader',
                exclude: /node_module/,
            }
        ]
    },
};
