<<<<<<< HEAD
import { HttpErrorResponse } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { AuthService } from '../../services/auth.service';

@Component({
    selector: 'app-registration',
    templateUrl: './registration.component.html',
    styleUrls: ['./registration.component.scss'],
})
export class RegistrationComponent {
    registrationForm!: FormGroup;
    successMessage: string | null = null;
    errorMessage: string | null = null;
    selectedRole: string | null = null;

    constructor(private formBuilder: FormBuilder, private authService: AuthService) { }

    ngOnInit(): void {
        this.registrationForm = this.formBuilder.group({
            username: ['', [Validators.required, Validators.pattern(/^[a-zA-Z0-9]+$/)]],
            email: ['', [Validators.required, Validators.email]],
            password: ['', [Validators.required, Validators.minLength(8), Validators.pattern(/^(?=.*[A-Z])(?=.*\d).+$/)]],
            role: ['', [Validators.required]],
            fullName: ['', Validators.required],
            contactNumber: ['', Validators.required],
            subject: [''],
            yearsOfExperience: [null],
            dateOfBirth: [null], 
            address: [''],
        });
    }

    onRoleChange(event: Event): void {
        const selectElement = event.target as HTMLSelectElement;
        const role = selectElement.value;
        this.selectedRole = role;

        
        if (role === 'TEACHER') {
            this.registrationForm.patchValue({ dateOfBirth: null, address: '' });
        } else if (role === 'STUDENT') {
            this.registrationForm.patchValue({ subject: '', yearsOfExperience: null });
        }
    }


    onSubmit(): void {
        if (this.registrationForm.valid) {
            this.authService.createUser(this.registrationForm.value).subscribe({
                next: (response) => {
                    this.successMessage = "User successfully registered";
                    this.errorMessage = null;
                    this.resetForm();
                    console.log('Success:', this.successMessage);
                },
                error: (error) => {
                    if (error.error) {
                        this.errorMessage = error.error;
                    } else {
                        this.errorMessage = 'An unexpected error occurred. Please try again later.';
                    }
                    this.successMessage = null;
                    console.error('Error:', this.errorMessage);
                }
            })
        } else {
            this.errorMessage = 'Please fill out all fields correctly.';
            this.successMessage = null;
        }
    }

    resetForm(): void {
        this.registrationForm.reset();
=======
import { Component } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";

@Component({
    selector:'app-registration',
    templateUrl:'./registration.component.html',
    styleUrls:['./registration.component.scss']
})

export class RegistrationComponent  {
    
    registrationForm: FormGroup;
    successMessage: string | null = null;
    errorMessage: string | null = null;

    constructor(private fb: FormBuilder)
    {
        this.registrationForm= this.fb.group({
            username:['', Validators.required],
            email:['', [Validators.required, Validators.email]],
            password:['',[Validators.required, Validators.minLength(8)]],
            role:['', Validators.required],


            fullName:[''],
            contactNumber:[''],
            subject:[''],
            yearsOfExperience:[null],
            dateOfBirth:[''],
            address:['']
        });
    }

    onSubmit(): void
    {
        this.successMessage=null;
        this.errorMessage=null;

        if(this.registrationForm.invalid)
        {
            this.errorMessage='Please fill out all fields correctly.';
            return;
        }
        this.successMessage='Registration successful!';
>>>>>>> aded839ee546cd3f1352e0b1340b17be457d4484
    }
}
