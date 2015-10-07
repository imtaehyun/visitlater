import React from 'react'

import { Router, Route, Link } from 'react-router'

const App = React.createClass({
    render() {
        return (
            <div>
                <ul>
                    <li><Link to="/">Home</Link></li>
                    <li><Link to="/login">Login</Link></li>
                </ul>
                <div>
                    {this.props.children}
                </div>
            </div>

        )
    }
})

const Login = React.createClass({
    render() {
        return (
            <div>
                Login
            </div>
        )
    }
})

const routes = {
    path: '/',
    component: App,
    childRoutes: [
        { path: 'login', component: Login },
    ]
}

React.render(<Router routes={routes} />, document.body)