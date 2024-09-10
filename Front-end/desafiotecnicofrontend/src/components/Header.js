import Link from 'next/link';

const Header = () => (
  <header>
    <h1>Task Manager</h1>
    <nav>
      <Link href="/">Home</Link>
      <Link href="/tasks">Tasks</Link>
    </nav>
  </header>
);

export default Header;