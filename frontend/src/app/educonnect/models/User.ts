<<<<<<< HEAD
import { Student } from "./Student";
import { Teacher } from "./Teacher";
=======

>>>>>>> aded839ee546cd3f1352e0b1340b17be457d4484
export class User {
    userId:number;
    username:string;
    password:string;
    role:string;
<<<<<<< HEAD
    student?:Student; // we are providing direct access to the the Student object (attributes)
    teacher?:Teacher; // Here as well we are storing the teacher id from the Teacher object into the User object.

    constructor( 
        userId:number,
        username:string,
        password:string,
        role:string,
        student?:Student,
        teacher?:Teacher){
=======
    studentId?:number;
    teacherId?:number;

    constructor( userId:number,
        username:string,
        password:string,
        role:string,
        studentId?:number,
        teacherId?:number){
>>>>>>> aded839ee546cd3f1352e0b1340b17be457d4484
            this.userId=userId;
            this.username=username;
            this.password = password;
            this.role=role;
<<<<<<< HEAD
            this.student=student;
            this.teacher=teacher;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
=======
            this.studentId=studentId;
            this.teacherId=teacherId;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
>>>>>>> aded839ee546cd3f1352e0b1340b17be457d4484
        }
}