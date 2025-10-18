import { Student } from "./Student";
import { Teacher } from "./Teacher";
export class User {
    userId:number;
    username:string;
    password:string;
    role:string;
    student?:Student; // we are providing direct access to the the Student object (attributes)
    teacher?:Teacher; // Here as well we are storing the teacher id from the Teacher object into the User object.

    constructor( 
        userId:number,
        username:string,
        password:string,
        role:string,
        student?:Student,
        teacher?:Teacher){
            this.userId=userId;
            this.username=username;
            this.password = password;
            this.role=role;
            this.student=student;
            this.teacher=teacher;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        }
}