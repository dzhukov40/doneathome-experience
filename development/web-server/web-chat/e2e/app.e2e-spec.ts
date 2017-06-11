import { WebChatPage } from './app.po';

describe('web-chat App', () => {
  let page: WebChatPage;

  beforeEach(() => {
    page = new WebChatPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
