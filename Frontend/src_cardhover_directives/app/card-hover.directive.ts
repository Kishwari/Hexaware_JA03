import { Directive, ElementRef, HostListener, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appCardHover]'
})
export class CardHoverDirective {



  constructor(private el: ElementRef, private renderer: Renderer2) {



  }

  @HostListener('mouseover') onMouseOver() {


    this.renderer.setStyle(this.el.nativeElement, 'backgroundColor', 'red')

    alert('mouser is over context');


  }




}