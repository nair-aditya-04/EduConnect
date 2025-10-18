<<<<<<< HEAD
import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Course } from '../../models/Course';
import { Teacher } from '../../models/Teacher';
import { EduConnectService } from '../../services/educonnect.service';

@Component({
  selector: 'app-coursecreate',
  templateUrl: './coursecreate.component.html',
  styleUrls: ['./coursecreate.component.scss']
})
export class CourseCreateComponent implements OnInit {
  courseForm: FormGroup;
  successMessage: string | null = null;
  errorMessage: string | null = null;
  teacher: Teacher;

  constructor(private formBuilder: FormBuilder, private educonnectService: EduConnectService) { }

  ngOnInit(): void {
    var teacherId = Number(localStorage.getItem("teacher_id"));
    this.courseForm = this.formBuilder.group({
      teacher: [{ value: '', disabled: true }],
      courseId: [null],
      courseName: ['', [Validators.required, Validators.minLength(2)]],
      description: ['']
    });
    this.educonnectService.getTeacherById(teacherId).subscribe({
      next: (response) => {
        this.teacher = response;
        this.courseForm.patchValue({ teacher: this.teacher.fullName });
      },
      error: (error) => console.log('Error loading loggedIn teacher details', error),
    });
  }

  onSubmit(): void {
    if (this.courseForm.valid) {
      const course: Course = {
        ...this.courseForm.getRawValue(),
        teacher: this.teacher,
      };
      this.educonnectService.addCourse(course).subscribe({
        next: (response) => {
          this.errorMessage = null;
          console.log(response);
          this.courseForm.reset();
          this.successMessage = 'Course created successfully!';
        },
        error: (error) => {
          this.handleError(error);
        }
      });
    }
  }

  private handleError(error: HttpErrorResponse): void {
    if (error.error instanceof ErrorEvent) {
      // Client-side error
      this.errorMessage = ` ${error.error.message}`;
    } else {
      // Backend error
      this.errorMessage = `${error.error}`;
    }
    this.successMessage = null;
  }
}

=======
import { Component } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";

@Component({
    selector:'app-coursecreate',
    templateUrl: './coursecreate.component.html',
    styleUrls:['./coursecreate.component.scss']
})

export class CourseCreateComponent {
    courseForm:FormGroup;
    successMessage :string;
    errorMessage :string;
 
    constructor(private fb: FormBuilder)
    {
        this.courseForm=this.fb.group({
            courseId:[0],
            courseName: ['', [Validators.required]],
            description:['', [Validators.required, Validators.maxLength(500)]],
            teacherId:[null, [Validators.required, Validators.pattern('^\\d+$')]]
        });
    }
    get f()
    {
        return this.courseForm.controls;
    }

    onSubmit(): void
    {
        this.successMessage='';
        this.errorMessage='';

        if(this.courseForm.invalid)
        {
            this.errorMessage='Error';
            return;
        }
        let teacher=this.courseForm.value;
        this.successMessage= 'Course created successfully!';
        this.courseForm.reset();
    }

    resetForm(): void
    {
        this.courseForm.reset();
        this.successMessage='';
        this.errorMessage='';
    }

}
>>>>>>> aded839ee546cd3f1352e0b1340b17be457d4484
