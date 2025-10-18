export class StudentDTO {
    studentId : number;
    username : string;
    password : string;
    fullName : string;
    dateOfBirth : Date;
    contactNumber : string;

    constructor(studentId : number,username : string,password : string,fullName : string,dateOfBirth : Date,contactNumber : string){
            this.studentId = studentId;
            this.username = username;
            this.password = password;
            this.fullName = fullName;
            this.dateOfBirth = dateOfBirth;
            this.contactNumber = contactNumber;
    }

<<<<<<< HEAD
    // logAttributes() : void{
    //     console.log("studentId:",this.studentId);
    //     console.log("username:",this.username);
    //     console.log("password:",this.password);
    //     console.log("fullName:",this.fullName);
    //     console.log("dateOfBirth:",this.dateOfBirth);
    //     console.log("contactNumber:",this.contactNumber);
    // }
=======
    logAttributes() : void{
        console.log("studentId:",this.studentId);
        console.log("username:",this.username);
        console.log("password:",this.password);
        console.log("fullName:",this.fullName);
        console.log("dateOfBirth:",this.dateOfBirth);
        console.log("contactNumber:",this.contactNumber);
    }
>>>>>>> aded839ee546cd3f1352e0b1340b17be457d4484
}
