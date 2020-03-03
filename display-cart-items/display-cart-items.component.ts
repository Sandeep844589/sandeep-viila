import { Component, OnInit } from '@angular/core';
import { BuyerServiceService } from '../buyer-service.service';
import { Cart } from '../Shoopingcart';

@Component({
  selector: 'app-display-cart-items',
  templateUrl: './display-cart-items.component.html',
  styleUrls: ['./display-cart-items.component.css']
})
export class DisplayCartItemsComponent implements OnInit {
  disCart:Cart[];
  constructor(private displaycart:BuyerServiceService) { 
    
  }

  ngOnInit(): void {
  
    this.displaycart.displayCartItems()
      .subscribe(disCart => this.disCart = disCart);
      console.log(this.disCart);
     this.user();

  }
  user()
  {
    this.disCart.buyerid=JSON.stringify(this.disCart.user);
  }

}
