import React, { Component } from 'react'



class AppHeader extends Component {

    render() {
        console.log(this.props);
        return (
            <div>
                <h1>{this.props.company} is Located At {this.props.place}</h1>
                <hr />
            </div>
        );
    }
}

export default AppHeader;