use std::io;

fn main(){
    println!("Enter a Word:");
    let mut input = String::new();

    io::stdin().read_line(&mut input) .expect("failed to readline");
    
    print!("You entered {}", input);
}