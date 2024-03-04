class Employee {
    eid = 0;
    ei: number = 99;
    ename = "jim";
    lastname: string = "Bryan";
    constructor() {
        console.log("Employee constructor");
    }
}
const employee = new Employee();
employee.eid = 101;
employee.ename = "jim";

console.log(employee);

// tsc employee.ts - to compile

// node employee.js - to execute