import { User } from "@/types/User";
import { useEffect, useState } from "react";

export default function Home() {
  
  const [data, setData] = useState<Array<User>>([]);

  const handleClick = async () => {
    const res = await fetch("http://localhost:8080/users");

    const data =  await res.json();

    setData(data);
  }

  return (
    <main className={"flex flex-col justify-items-center items-center p-3"}>
      <h1>Esta madre depende de la ruta así que...</h1>

      <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Odio error nihil beatae accusamus nesciunt excepturi dicta nostrum architecto ex repudiandae deleniti quae numquam aut optio dolorum molestiae, minus quam eius.</p>
      <p>Quidem, repudiandae sed inventore doloribus deleniti perferendis totam nemo vero obcaecati cum reprehenderit quam quasi quae labore veniam sequi, eveniet atque ipsum. Consectetur, aperiam! Possimus perspiciatis illo quo sint rem.</p>
      <p>Eum maiores quidem hic nemo omnis nisi officia similique consequuntur, consequatur explicabo fugit quae tempora sed, dolorum eveniet. A dolor quo inventore repudiandae laborum eligendi quis explicabo id veritatis incidunt?</p>
      <p>Sed tenetur id eos, delectus rem molestias animi quasi accusantium facilis quaerat natus optio, quis ut laborum iste eius. Quidem doloremque nihil excepturi vel impedit doloribus distinctio id saepe alias?</p>
    </main>
  )
}
