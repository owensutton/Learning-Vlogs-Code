

// Rust Vlog 3 - Learning Variables and stuff


fn main(){

    let x = 7;
    let y = 7;


    if x > y {
        println!("The value of X is greater than y");
    } else if y > x {
        println!("The value of Y is greater than x");
    } else {
        println!("Both x and y are equal");
    }

    let mut a = 0;

    while 10 > a {
        a += 1;
        println!("{}",a);
    }


    for i in 1..6 {
        println!("{}",i);
    }

    
}