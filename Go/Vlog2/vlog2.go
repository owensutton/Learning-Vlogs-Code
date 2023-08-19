// go If else operations and other learning

package main

import "fmt"

func main() {

	x := 2

	if x > 5 {
		fmt.Printf("X is greater than 5")
	} else if x < 5 {
		fmt.Printf("X is less than 5")
	} else {
		fmt.Printf("X is equal to 5")
	}

	switch x {
	case 1:
		fmt.Printf("\nx is equal to 1")
	case 2:
		fmt.Printf("\nX is equal to 2")

	}

}
