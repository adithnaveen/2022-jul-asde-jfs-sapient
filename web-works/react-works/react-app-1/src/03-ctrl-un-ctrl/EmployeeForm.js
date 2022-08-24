import React, { Component } from 'react';


class EmployeeForm extends Component {
    state = {
        name: "",
        email: "",
        contact: "",
        pic: "",
        formError: {
            name: "Enter Employee Name",
            email: "Enter Email",
            contact: "Enter Contact"
        },
        errorMessages: ""
    }

    tfHandler = (evt) => {

        let { name, value } = evt.target;

        let { formError } = this.state;
        switch (name) {
            case 'name':
                if (!value || value.length === 0) {
                    formError.name = "Enter Employee Name";
                } else if (value.length < 3 || value.length > 10) {
                    formError.name = "Employee Name should be betwen 3 to 10 chars";
                } else {
                    formError.name = "";
                }
                break;
            case 'email':
                if (!value || value.length === 0) {
                    formError.email = "Email Required";
                } else if (!value.match(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/)) {
                    formError.email = "Invalid Email Address"
                } else {
                    formError.email = "";
                }
                break;
            case 'contact':
                if (!value || value.length === 0) {
                    formError.contact = "Contact Required ";
                } else if (!value.match(/^\d{10,12}$/)) {
                    formError.contact = "Invalid Contact should be between 10,12"
                } else {
                    formError.contact = "";
                }

                break;
            default:
                break;
        }


        this.setState({ [name]: value, formError });

    }
    submitHandler = (event) => {
        event.preventDefault();


        let { formError } = this.state;

        if (this.validateForm(formError)) {
            alert("Form Submitted...");
        } else {
            let errorMessages = Object.values(formError).
                map((err, idx) => err.length === 0 ? null : <li key={idx}>{err}</li>)
            this.setState({ errorMessages });
        }


        let { name, contact, email, pic } = this.state;
        console.log(name, contact, email, pic);

    }


    validateForm = (formError) => {
        let valid = true;
        Object.values(formError).forEach((err) => valid = valid && err.length === 0);
        return valid;
    }

    render() {
        return (
            <div className="container">
                <div className="row">
                    <div className="col-md-6">
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
                                        name="email" id="email" className="form-control" value={this.state.email} />
                                </div>
                            </div>

                            <div className="form-group row">
                                <label htmlFor="contact" className="control-label col-md-4">Employee Contact</label>
                                <div className="col-md-8">
                                    <input type="text"
                                        onChange={this.tfHandler}
                                        name="contact" id="contact" className="form-control" value={this.state.contact} />
                                </div>
                            </div>


                            <div className="form-group row">
                                <label htmlFor="pic" className="control-label col-md-4">Employee Picture</label>
                                <div className="col-md-8">
                                    <input type="text"
                                        onChange={this.tfHandler}
                                        name="pic" id="pic" className="form-control" value={this.state.pic} />
                                </div>
                            </div>

                            <button className="btn btn-primary">Submit</button>
                        </form>
                    </div>

                    <div className="col-md-6">

                        <ul>
                            {this.state.errorMessages}
                        </ul>

                        <hr />
                        <h4>State : </h4>
                        <pre>{JSON.stringify(this.state, null, 3)}</pre>

                    </div>

                </div>
            </div>
        );
    }
}

export default EmployeeForm;