import React from 'react';

// version 1
/*function Loading(OldComponent) {
    return class Loading extends Component {
        render() {
            let output = <OldComponent  {... this.props} />

            if (this.props.contacts.length === 0) {
                output = <h3 className='alert alert-danger'>Loading Please wait...</h3>
            }

            return output;
        }
    }
}
export default Loading;

*/

// version 2 


function isEmpty(data) {
    if (data && data instanceof Array) {
        return data.length === 0;
    }

    // if data it not array 
    if (data) {
        return Object.keys(data).length === 0;
    }

}

const Loading = (property) => (OldComponent) => (props) => {
    let output = <OldComponent  {...props} />

    if (isEmpty(props[property])) {
        output = <h3 className='alert alert-danger'>Loading Please wait...</h3>
    }

    return output;
}


export default Loading;