import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

import { EduConnectRoutingModule } from "./educonnect-routing.module";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import { StudentCreateComponent } from "./components/studentcreate/studentcreate.component";
import { TeacherCreateComponent } from "./components/teachercreate/teachercreate.component";
import { CourseCreateComponent } from "./components/coursecreate/coursecreate.component";
<<<<<<< HEAD
import { RouterModule } from "@angular/router";
import { EnrollmentComponent } from "./components/enrollment/enrollment.component";
import { SharedModule } from "../shared/shared.module";
import { DashboardComponent } from "./components/dashboard/dashboard.component";
import { StudentEditComponent } from "./components/studentedit/studentedit.component";
import { TeacherEditComponent } from "./components/teacheredit/teacheredit.component";
import { CourseEditComponent } from "./components/courseedit/courseedit.component";

@NgModule({
  declarations: [
    StudentCreateComponent,
    TeacherCreateComponent,
    CourseCreateComponent,
    EnrollmentComponent,
    DashboardComponent,
    StudentEditComponent,
    TeacherEditComponent,
    CourseEditComponent
=======
// import { StudentSampleComponent } from "./components/studentsample/studentsample.component";
@NgModule({
  declarations: [
  // StudentSampleComponent
  StudentCreateComponent,
  TeacherCreateComponent,
  CourseCreateComponent,

>>>>>>> aded839ee546cd3f1352e0b1340b17be457d4484
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule,
<<<<<<< HEAD
    RouterModule,
    EduConnectRoutingModule,
    SharedModule
  ],
  exports: [
=======
  ],
  exports: [
    
>>>>>>> aded839ee546cd3f1352e0b1340b17be457d4484
  ]
})
export class EduconnectModule {}
