<<<<<<< HEAD
import { Teacher } from "./Teacher";
=======

>>>>>>> aded839ee546cd3f1352e0b1340b17be457d4484
export class Course {
    courseId:number;
    courseName: string;
    description: string;
<<<<<<< HEAD
    teacher: Teacher;

    constructor(courseId:number,courseName: string,description: string,teacher: Teacher){
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.teacher = teacher;
    }

    // logAttributes() : void{
    //     console.log("courseId:", this.courseId);
    //     console.log("courseName:",this.courseName);
    //     console.log("teacher:",this.teacher);
    //     console.log("description:",this.description);
        
    // }
    
=======
    teacherId: number;

    constructor(courseId:number,courseName: string,description: string,teacherId: number){
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.teacherId = teacherId;
    }

    logAttributes() : void{
        console.log("courseId:", this.courseId);
        console.log("courseName:",this.courseName);
        console.log("description:",this.description);
        console.log("teacherId:",this.teacherId);
    }
>>>>>>> aded839ee546cd3f1352e0b1340b17be457d4484
}