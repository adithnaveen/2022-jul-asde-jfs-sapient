import React, { Component } from 'react';


class EmployeeForm extends Component {
    state = {
        name: "",
        email: "",
        contact: "",
        pic: ""
    }

    tfHandler = (evt) => {
        console.log(evt);
    }
    submitHandler = (event) => {
        event.preventDefault();
        console.log(this.state);
    }

    render() {
        return (
            <div className="container">
                <div className="row">
                    <div className="col">
                        <form className="form-group" onSubmit={this.submitHandler}>

                            <div className="form-group row">
                                <label htmlFor="name" className="control-label col-md-4">Employee Name</label>
                                <div className="col-md-8">
                                    <input type="text"
                                        onChange={this.tfHandler}
                                        name="name" id="name" className="form-control" value={this.state.name} />
                                </div>
                            </div>
                            <div className="form-group row">
                                <label htmlFor="email" className="control-label col-md-4">Employee Email</label>
                                <div className="col-md-8">
                                    <input type="text"
                                        onChange={this.tfHandler}
                                        id="email" className="form-control" value={this.state.email} />
                                </div>
                            </div>

                            <div className="form-group row">
                                <label htmlFor="contact" className="control-label col-md-4">Employee Contact</label>
                                <div className="col-md-8">
                                    <input type="text"
                                        onChange={this.tfHandler}
                                        id="contact" className="form-control" value={this.state.contact} />
                                </div>
                            </div>


                            <div className="form-group row">
                                <label htmlFor="pic" className="control-label col-md-4">Employee Picture</label>
                                <div className="col-md-8">
                                    <input type="text"
                                        onChange={this.tfHandler}
                                        id="pic" className="form-control" value={this.state.pic} />
                                </div>
                            </div>

                            <button className="btn btn-primary">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        );
    }
}

export default EmployeeForm;