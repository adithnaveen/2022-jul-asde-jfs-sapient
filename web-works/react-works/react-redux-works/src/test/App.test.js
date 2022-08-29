import { render, screen } from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import App from '../App';


test('should have contact list component ', () => {
    const h1ElementContactList = render(<App />).getByText(/Contact List/i);
    expect(h1ElementContactList).toBeInTheDocument();
})


test('enter name in the text ', () => {
    render(<App />);
    userEvent.type(screen.getByText("Name"), 'hello');
    userEvent.type(screen.getByText("Email address"), 'hello');
    userEvent.type(screen.getByText("Phone number"), 'hello');
    userEvent.type(screen.getByText("URL"), 'hello');

    const addToListBtn = screen.getByText(/Add to list/i);
    userEvent.click(addToListBtn);
})


