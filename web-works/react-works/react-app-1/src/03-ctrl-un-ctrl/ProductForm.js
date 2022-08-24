import React, { Component } from 'react';



class ProductForm extends Component {


    addProduct = (event) => {
        console.log("Product Form Submitted... ");
        event.preventDefault();
        let pName = this.refs.pname.value;
        let pPrice = this.refs.price.value;
        let pDesc = this.refs.description.value;
        let pPic = this.refs.pic.value;

        const p1 = { pName, pPrice, pDesc, pPic };
        console.log(p1);

        this.refs.pname.value = "";
        this.refs.price.value = "";
        this.refs.description.value = "";
        this.refs.pic.value = "";


    }

    render() {
        return (
            <div className="container">
                <h3>Product Form</h3>
                <form onSubmit={this.addProduct}>
                    {/* .form-group.row>label.control-label.col-md-4{Product Name}+.col-md-8>input:text.form-control#pname */}

                    <div className="form-group row">
                        <label htmlFor="pname" className="control-label col-md-4">Product Name</label>
                        <div className="col-md-8">
                            <input type="text" id="pname" ref="pname" className="form-control" />
                        </div>
                    </div>


                    <div className="form-group row">
                        <label htmlFor="price" className="control-label col-md-4">Product Price</label>
                        <div className="col-md-8">
                            <input type="text" id="price" ref="price" className="form-control" />
                        </div>
                    </div>


                    <div className="form-group row">
                        <label htmlFor="description" className="control-label col-md-4">Product Description</label>
                        <div className="col-md-8">
                            <input type="text" id="description" ref="description" className="form-control" />
                        </div>
                    </div>


                    <div className="form-group row">
                        <label htmlFor="pic" className="control-label col-md-4">Product Picture</label>
                        <div className="col-md-8">
                            <input type="text" id="pic" ref="pic" className="form-control" />
                        </div>
                    </div>

                    <button className="btn btn-danger">Submit</button>

                </form>
            </div>
        );
    }
}

export default ProductForm;