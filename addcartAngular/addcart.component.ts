import { Component, OnInit, Input } from '@angular/core';
import { Product } from '../Product';
import { BuyerServiceService } from '../buyer-service.service';
import { Cart } from '../Shoopingcart';

@Component({
  selector: 'app-addcart',
  templateUrl: './addcart.component.html',
  styleUrls: ['./addcart.component.css']
})
export class AddcartComponent implements OnInit {


  constructor(private cartService:BuyerServiceService) { }
  @Input()
  i:Product =new Product();
  cart:Cart =new Cart();

  ngOnInit(): void {
    this.cart=new Cart();
  }
  addCart()
  {
    this.cartService.addCart(this.cart).subscribe(cart => this.cart=cart);
  }
  onSubmit(){
    this.cart.productid=this.i.productid;
    this.cart.selerid=this.i.sdetails;
    this.cart.quantity=this.i.quantity;
    this.cart.price=this.i.price;
 this.addCart();
  }

}
