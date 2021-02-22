import {
  customElement,
  html,
  LitElement,
  PropertyValues,
  query,
} from "lit-element";

@customElement("empty-view")
export class EmptyView extends LitElement {
  @query("#root")
  private root!: HTMLElement;

  createRenderRoot() {
    // Do not use a shadow root
    return this;
  }
  render() {
    return html`<div id="root"></div>`;
  }

  protected firstUpdated(_changedProperties: PropertyValues) {
    super.firstUpdated(_changedProperties);
    this.root.innerText = "Hello";
  }
}
