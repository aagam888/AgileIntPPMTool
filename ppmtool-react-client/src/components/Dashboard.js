import React, { Component } from "react";
import Projectitems from "./Project/Projectitems";
import CreateProjectButton from "./Project/CreateProjectButton";

export default class Dashboard extends Component {
  render() {
    return (
      <div className="projects">
        <div className="container">
          <div className="row">
            <div className="col-md-12">
              <h1 className="display-4 text-center">Projects</h1>
              <br />
              <CreateProjectButton />
              <br />
              <hr />
              <Projectitems />
            </div>
          </div>
        </div>
      </div>
    );
  }
}
